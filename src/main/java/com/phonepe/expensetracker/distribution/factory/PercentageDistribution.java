package com.phonepe.expensetracker.distribution.factory;

import com.phonepe.expensetracker.distribution.dto.DistributeExpenseInput;
import com.phonepe.expensetracker.distribution.dto.DistributionTypeResponse;
import com.phonepe.expensetracker.exception.NotImplementedDistributionStrategyException;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PercentageDistribution implements Distribution {

    @Override
    public DistributionTypeResponse distributeExpenses(DistributeExpenseInput distributeExpenseInput) {
        // TODO: can be implemented when needed
        throw new NotImplementedDistributionStrategyException("PercentageDistribution is not yet supported.");
    }

    @Override
    public DistributionType distributionType() {
        return DistributionType.PERCENTAGE;
    }
}
