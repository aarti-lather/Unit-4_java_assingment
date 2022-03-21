package evaluation3;
import java.util.Comparator;

public class EmployName  implements Comparator<EmployObject>{

    @Override
        public int compare(EmployObject o1, EmployObject o2) {
            return o1.getEmpName().compareTo(o2.getEmpName());
        }
    }

