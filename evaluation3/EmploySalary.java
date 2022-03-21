package evaluation3;
import java.util.Comparator;
public class EmploySalary implements Comparator<EmployObject>{



        @Override
        public int compare(EmployObject o1, EmployObject o2) {
            if(o1.getEmpSalary()> o2.getEmpSalary())
                return -1;
            else if(o1.getEmpSalary()< o2.getEmpSalary())
                return +1;
            else
                return 0;

        }
    }

