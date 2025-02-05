package entities;

public class TaxPayer {
    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double heathSpending;
    private double educationSpending;

    public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome,
                    double heathSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.heathSpending = heathSpending;
        this.educationSpending = educationSpending;
    }

    public double getSalaryIncome() {
        return salaryIncome;
    }

    public double getServicesIncome() {
        return servicesIncome;
    }

    public double getCapitalIncome() {
        return capitalIncome;
    }

    public double getHeathSpending() {
        return heathSpending;
    }

    public double getEducationSpending() {
        return educationSpending;
    }

    public double salaryTax() {
        double monthSalary = salaryIncome / 12;

        if (monthSalary < 3000.00) {
            return 0;
        } else if (monthSalary < 5000.00) {
            return salaryIncome * 10/100;
        }
        return salaryIncome * 20/100;
    }

    public double servicesTax() {
        return servicesIncome * 15/100;
    }

    public double capitalTax() {
        return capitalIncome * 20/100;
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate() {
        double healthAndEducationSpending = heathSpending + educationSpending;
        if (healthAndEducationSpending / grossTax() > 0.30) {
            return grossTax() * 30/100 ;
        }
        return healthAndEducationSpending;
    }

    public double netTask() {
        return grossTax() - taxRebate();
    }
}
