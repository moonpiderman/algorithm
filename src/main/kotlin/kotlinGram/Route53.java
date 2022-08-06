package kotlinGram;

public class Route53 {
    private boolean requestDomain(
            String HOSTED_ZONE_ID,
            String domainName,
            String domainType,
            long domainTTL,
            String domainValue,
            ChangeAction changeAction
    ) {


        // AWS S3 접근 권한을 부여받기 위해, "credentials" 파일이 로컬PC의 '~/.aws/credentials' 경로에 있어야 한다.
        // 도메인 등록시 매번 인증할 필요가 없다면 함수 밖으로 빼도 될 것 같다. 혹은, Context에서 Singleton 처리.
        AmazonRoute53 route53Client = AmazonRoute53ClientBuilder.standard()
                .withRegion(REGION)
                .build();


        // 본 함수는 파라미터로 전달받은 도메인 정보를 이용하여 1회 도메인 요청하는 예제이다.
        // 1개의 대상 Hosted Zone에 대해서 다수의 도메인 요청 또한 가능하다.
        List<Change> changeList = new ArrayList<Change>();


        // 도메인 정보 설정
        ResourceRecordSet rrs = new ResourceRecordSet().withName(domainName)
                .withType(domainType)
                .withTTL(domainTTL)
                .withResourceRecords(new ResourceRecord().withValue(domainValue))
                ;


        // 도메인 정보 및 액션 설정
        changeList.add(new Change().withAction(changeAction)
                .withResourceRecordSet(rrs))
        ;


        ChangeBatch cb = new ChangeBatch().withChanges(changeList);


        // Hosted Zone 지정
        ChangeResourceRecordSetsRequest crrsr = new ChangeResourceRecordSetsRequest().withHostedZoneId(HOSTED_ZONE_ID)
                .withChangeBatch(cb);


        boolean isSuccess = false;

        // 신규 도메인 등록
        try {
            route53Client.changeResourceRecordSets(crrsr);
            isSuccess = true;
        } catch (RuntimeException e) {
            e.printStackTrace();
            isSuccess = false;
        }
        return isSuccess;
    }
}
