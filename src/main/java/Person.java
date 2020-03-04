public class Person extends Wage{
    private int numset;
        private String name;
        private int idNum;
        private int age;
        private double wage;
        private int num = 0;




public Person(){

}


    public Person(String name, int idNum, int age,double wage,int numset) {

        this.name = name;
        this.idNum = idNum;
        this.age = age;
        this.wage = wage;
        this.numset = numset;

    }
    public void setNumset(int numset) {
        this.numset = numset;
    }

    public int returnNum(){
        return 5;
    }


    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }



        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getIdNum() {
            return idNum;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String pName) {
            this.name = pName;
        }

        public void setIdNum(int id) {
            this.idNum = id;
        }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idNum=" + idNum +
                ", age=" + age +
                ", wage=" + wage +
                '}';
    }

    @Override
    public String calculateWage() {
        return name + " Earns "+wage;
    }
}

