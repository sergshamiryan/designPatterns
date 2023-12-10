package org.example.structural.proxy.problem2;

public class ProxyInternetAccess implements GrantInternetAccess {
    private final int employeeRank;

    public ProxyInternetAccess(int employeeRank) {
        this.employeeRank = employeeRank;
    }


    @Override
    public void grantInternetAccess() {
        if (employeeRank < 5) {
            System.out.println("Access Denied");
            return;
        }
        RealInternetAccess realInternetAccess = new RealInternetAccess(employeeRank);
        realInternetAccess.grantInternetAccess();
    }
}
