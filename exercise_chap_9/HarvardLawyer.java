public class HarvardLawyer extends Lawyer {

    // Overrides getSalary from Lawyer class
    @Override
    public double getSalary() {
        return super.getSalary() * 1.20;
    }

    @Override
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }

    @Override
    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }
}