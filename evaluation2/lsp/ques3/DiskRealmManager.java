//it is voilation Interface segreation Princple,   we will fix it


package evaluation2.lsp.ques3;

public class DiskRealmManager implements NewManager {
    @Override
    public void Read() {

    }

    @Override
    public void write() {

    }
}





    class DiskCoreDataManager implements NewManager{

        @Override
        public void Read() {

        }

        @Override
        public void write() {

        }
    }
    class InMemoryRealmManager implements Manager{

        @Override
        public void Read() {

        }
    }

    class Main{
        public static void main(String[] args) {

            NewManager dm = new DiskRealmManager();
            dm.write();
            dm.Read();
            Manager dm1 = new InMemoryRealmManager();
            dm1.Read();

            NewManager dm2 = new DiskCoreDataManager();
            dm.Read();
            dm.write();

        }
    }

