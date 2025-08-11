class Detail {
    static int startingRegister = 104031;
    int regnum;
    String name;
    String dept;
    String mail;

    Detail(String name, String dept, String mail) {
        regnum = startingRegister++;
        this.name = name;
        this.dept = dept;
        this.mail = mail;
    }

    void print() {
        System.out.println("Regi num: " + regnum);
        System.out.println("Name    : " + name);
        System.out.println("Dept    : " + dept);
        System.out.println("Mail    : " + mail);
    }
}

class Student {
    public static void main(String[] args) {
        Detail s1 = new Detail("Pragatheesh", "CSE", "pragatheesh@gmail.com");
        Detail s2 = new Detail("Mithun", "IT", "fhubirbf@gmail.com");
        Detail s3 = new Detail("Rohith", "CSE", "jibvihv@gmail.com");

        s1.print();
        s2.print();
        s3.print();
    }
}
