class Stud {
    int regno;
    String name;

    Stud() {
        regno = 123;
        name = "nanda";
        System.out.println(regno + " :" + name);
    }

    Stud(int n1) {
        regno = n1;
        name = "kumar";
        System.out.println(regno + " : " + name);
    }

    Stud(String name) {
        regno = 456;
        this.name = name;
        System.out.println(regno + " : " + name);
    }
}

class array {
    public static void main(String args[]) {
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 4;
        System.out.println(num[1]);
        for (int i = 0; i < num.length; i++)
            System.out.println(num[i]);
        int numbers[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 11, 12, 13, 14, 15 }, { 9, 10, 11, 12 }

        };
        for (int i = 0; i < 3; i++, System.out.println()) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(" \t " + numbers[i][j]);
            }
        }
        Stud s1 = new Stud();
        Stud s2 = new Stud(123);
        Stud s3 = new Stud("Konetisetti");

        Stud s[] = { s1, s2, s3 };
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }

        // Enhanced for loop in java
        int[] array = { 1, 2, 3, 4, 5, 65, 90, 9, 78 };
        for (int i : array) {
            System.out.print(" " + i);

        }
        System.out.println();
        int arrays[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 11, 12, 13, 14, 15 }, { 9, 10, 11, 12 }

        };
        for (int k[] : arrays) {
            for (int l : k) {
                System.out.print(" " + l);
            }
            System.out.println();
        }

    }

}