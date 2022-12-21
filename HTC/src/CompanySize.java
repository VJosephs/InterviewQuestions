/*A company has a hierarchical structure where a manager can manage at most 8 employees.  All employees have exactly 1 manager

        * except for the top level manager whom does not have a manager.

        *

        * Write a function to calculate the maximum number of employees possible at the company for a given number of management levels n.

        * Solve recursively or iteratively using no built in math power libraries.

        *

        *   solve(int n);

        *

        *     Ex 1 solve(0) = 1

        *     Ex 2 solve(1) = 9

        *     Ex 3 solve(2) = 65
        */
public class CompanySize {
    //Max amount of employees per Manager
    public int maxEmployeesPerMgr = 8;
    public  int companySize(int MgmtLevels) {
        if(MgmtLevels == 0)
            return 1;
        // We add one because you need to need have at least one Manager for the first level of managers
        else
            return power(maxEmployeesPerMgr, MgmtLevels)+1;
    }

    public int power(int base, int power) {
        if(power == 0)
            return 1;
        else
            return base * power(base, power-1);
    }
}
