package kotlinGram

import java.math.BigDecimal
import kotlin.math.sqrt

fun main() {
    val buildingPoint = 100.25
    val ownerRentFee = 10.25

    println("--------- big decimal ---------")

    val properRentFee = SuSickGyeSan.properRentFee(buildingPoint)
    println("properRentFee : $properRentFee")

    val rentFeeRateByBuildingOwner = SuSickGyeSan.rentFeeRateByBuildingOwner(ownerRentFee, properRentFee)
    println("rentFeeRateByOwner : $rentFeeRateByBuildingOwner")

    val rateMetaverse = SuSickGyeSan.rateOfMetaverseCustomer(rentFeeRateByBuildingOwner)
    println("rate of Metaverse : $rateMetaverse")

    println("--------- double ---------")

    val properRentFeeR = SuSickGyeSan.properRentFeeR(buildingPoint)
    println("properRentFee : $properRentFeeR")

    val rentFeeRateByBuildingOwnerR = SuSickGyeSan.rentFeeRateByBuildingOwnerR(ownerRentFee, properRentFeeR)
    println("rentFeeRateByOwner : $rentFeeRateByBuildingOwnerR")

    val rateMetaverseR = SuSickGyeSan.rateOfMetaverseCustomerR(rentFeeRateByBuildingOwnerR)
    println("rate of Metaverse : $rateMetaverseR")
}

object SuSickGyeSan {
    fun properRentFee(buildingPoint: Double): BigDecimal {
        val rate = BigDecimal.valueOf(0.01635)
        return buildingPoint.toBigDecimal() * rate
    }

    fun rentFeeRateByBuildingOwner(ownerRentFee: Double, properRentFee: BigDecimal): BigDecimal {
        return BigDecimal.valueOf(ownerRentFee) / properRentFee
    }

    fun rateOfMetaverseCustomer(rateOfProperFee: BigDecimal): BigDecimal {
        val mother = ((7 * sqrt(5.0)) * sqrt(rateOfProperFee.toDouble())) - 12
        return BigDecimal.valueOf(2 / mother)
    }

    fun properRentFeeR(buildingPoint: Double): Double {
        val rate = 0.01635
        return buildingPoint * rate
    }

    fun rentFeeRateByBuildingOwnerR(ownerRentFee: Double, properRentFee: Double): Double {
        return ownerRentFee / properRentFee
    }

    fun rateOfMetaverseCustomerR(rateOfProperFee: Double): Double {
        val mother = ((7 * sqrt(5.0)) * sqrt(rateOfProperFee)) - 12
        return 2 / mother
    }
}