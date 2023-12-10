package org.example.structural.proxy.problem2;

public class RealInternetAccess implements GrantInternetAccess {

    private final int employeeRank;

    public RealInternetAccess(int employeeRank) {
        this.employeeRank = employeeRank;
    }

    @Override
    public void grantInternetAccess() {
        System.out.printf(
                "Internet access is granted! - Employee Rank: %d\n",
                employeeRank);
    }
}
