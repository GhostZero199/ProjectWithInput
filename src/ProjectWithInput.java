import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.*;


public class ProjectWithInput {
    //static String feName = nameGeneration.firstname() + " " + nameGeneration.lastname();
    //static String seName = nameGeneration.firstname() + " " + nameGeneration.lastname();
    static String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String numbers = "0123456789";
    static int mailCap = 100;
    static String Name;
    static String CNP;
    static String[] splitName;

    public static void main(String[] args) {
        //CNPCheckClass.CNPChecker();
        //departmentGeneratorClass.depGenerator();
        //emailGeneratorClass.emailGen();
        System.out.println("Name");
        BufferedReader NameInput = new BufferedReader(new InputStreamReader(System.in));
        try {
            Name = NameInput.readLine();
            splitName = Name.trim().split("\\s+");
            System.out.println(NameInput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedReader CnpInput = new BufferedReader(new InputStreamReader(System.in));
        try {
            CNP = CnpInput.readLine();
            System.out.println(CnpInput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            //CNPCheckClass.CNPGen();
            if(CNP.length() == 13 && CNP.matches("\\d+")) {
            //fNameIndex++;
            //nameGeneration.firstname();
            //nameGeneration.lastname();
            passwordGen.password();



            //String eName = nameGeneration.fName + " " + nameGeneration.lName;

            System.out.println("New employee data:");
            System.out.println("Name: " + Name);
            System.out.println("CNP: " + CNP);
            emailGeneratorClass.personalEmail();
            System.out.println("Personal Email: " + Name.replace(" ", ".") + emailGeneratorClass.email);
            CNPCheckClass.ageCheck();
            System.out.println("Age: " + CNPCheckClass.eAge);
            if(CNPCheckClass.eAge < 18){
                System.out.println("Person is underage, cannot be hired!");
                System.out.println("\n");
            }
            else{
                mailCap = 100;
                System.out.println("Department: " + departmentGeneratorClass.depGenerator());
                System.out.println("Work Email: " + splitName[0] + "." + splitName[1] + emailGeneratorClass.emailGen() ) ;
                System.out.println("eMail capacity: " + ProjectWithInput.mailCap + " GB");
                emailGeneratorClass.mailCapChange();
                System.out.println("Password: " + passwordGen.Password);
                passwordGen.changedPass();


                System.out.println("\n");

            }
        }





        /*if(CNPCheckClass.isValid){
            if(CNPCheckClass.GeneratedCNPE1 != CNPCheckClass.GeneratedCNPE2 && feName != seName) {
                departmentGeneratorClass.depGenerator();
                //firstemployee
                System.out.println("Employee name: " + feName);
                System.out.println("Personal email: " + feName.replace(" ", ".") + emailGeneratorClass.personalEmail());
                System.out.println("CNP: " + CNPCheckClass.GeneratedCNPE1);
                System.out.println("Department: " + departmentGeneratorClass.GeneratedDepartment);
                System.out.println("Company eMail: " + feName.replace(" ", ".") + emailGeneratorClass.emailGen());
                System.out.println("Company eMail password: " + passwordGen.password());
                passwordGen.changedPass();
                System.out.println("eMail capacity: " + emailGeneratorClass.mailCap + " GB");
                emailGeneratorClass.mailCapChange();
                System.out.println("eMail capacity: " + emailGeneratorClass.mailCap + " GB");

                System.out.println("\n");
                //secondemployee
                departmentGeneratorClass.depGenerator();
                System.out.println("Employee name: " + seName);
                System.out.println("CNP: " + CNPCheckClass.GeneratedCNPE2);
                System.out.println("Department: " + departmentGeneratorClass.GeneratedDepartment);
                System.out.println("Company eMail: " + seName.replace(" ", ".") + emailGeneratorClass.emailGen());
                System.out.println("Company eMail password: " + passwordGen.password());
            }

        }
        /*if (CNPCheckClass.isValid && CNPCheckClass.GeneratedCNPE1 == CNPCheckClass.GeneratedCNPE2) {
            System.out.println("CNP cannot be the same");
        }
        if (feName == seName){
            System.out.println("Error, two employees cannot have the same name!");
        }
        if (CNPCheckClass.GeneratedCNPE1 == CNPCheckClass.GeneratedCNPE2){
            System.out.println("Error, two employees cannot have the same CNP!");
        }
        if(!CNPCheckClass.isValid){
            System.out.println("WRONG CNP");
            System.out.println(CNPCheckClass.GeneratedCNPE1 + " " + CNPCheckClass.GeneratedCNPE2);
        }*/
    }
}



    class nameGeneration {
        static String fName;
        static String lName;
        static int fIndex;
        static int lIndex;
        static void firstname() {

            String[] fNames = {"James", "Robert", "John", "Michael", "David"};




            if (fIndex < 4){

                fName = fNames[fIndex];
                //System.out.println(fName);
                fIndex++;
            }


            //return fName;
        }

        static void lastname() {

            String[] lNames = {"Smith", "Johnson", "Williams", "Brown"};

            if (lIndex < 5){

                lName = lNames[lIndex];
                //System.out.println(fName);
                lIndex++;
            }



        }


    }

class CNPCheckClass {
    //static String GeneratedCNPE1;
    //static String GeneratedCNPE2;
    static String GeneratedCNP;
    static int CNPIndex;
    static int eAge;
    static boolean isValid;


        static String CNPGen() {

            String[] CNPList = {"6000917018000", "2870917015911", "2990202018333", "2800509018368", "6050917015591" };



            if (CNPIndex < 4){

                GeneratedCNP = CNPList[CNPIndex];
                //System.out.println(GeneratedCNP);
                CNPIndex++;
            }
            isValid = ProjectWithInput.CNP.length() == 13 && ProjectWithInput.CNP.matches("\\d+");

            return GeneratedCNP;
        }



        static void ageCheck(){

            int index1 = 1;
            int index2 = 2;
            char ch1 = ProjectWithInput.CNP.charAt(index1);
            char ch2 = ProjectWithInput.CNP.charAt(index2);

            String year = new StringBuilder().append(ch1).append(ch2).toString();
            //System.out.println(year);
            int index0 = 0;
            char firstD = ProjectWithInput.CNP.charAt(index0);
            //System.out.println(firstD);

            if(firstD =='1' || firstD == '2'){
                String yearBornS = "19" + year;
                System.out.println("Employee's born year is: " + yearBornS);
                int yearBornI = Integer.parseInt(yearBornS);
                eAge = 2022 - yearBornI;
                //System.out.println("Employee's age is: " + eAge);
            }
            if(firstD =='5' || firstD == '6'){
                String yearBornS = "20" + year;
                System.out.println("Employee's born year is: " + yearBornS);
                int yearBornI = Integer.parseInt(yearBornS);
                eAge = 2022 - yearBornI;
                //System.out.println("Employee's age is: " + eAge);
            }
        }


        //Random CNPRandomE1 = new Random();
        //Random CNPRandomE2 = new Random();
        //Random CNPRandom = new Random();

        //int CNPIndexE1 = CNPRandomE1.nextInt(CNPList.length);
        //int CNPIndexE2 = CNPRandomE2.nextInt(CNPList.length);
        //int CNPIndex = CNPRandom.nextInt(CNPList.length);

        //GeneratedCNPE1 = (CNPList[CNPIndexE1]);
        //GeneratedCNPE2 = (CNPList[CNPIndexE2]);
        //GeneratedCNP = (CNPList[CNPIndex]);


        //System.out.println(GeneratedCNP);
        //System.out.println(GeneratedCNP.length());








}

class departmentGeneratorClass {
    static String GeneratedDepartment;

    static String depGenerator(){

            String[] departments = {"Sales", "Development", "Accounting", "None"};

            Random depRandom = new Random();

            int depIndex = depRandom.nextInt(departments.length);


            GeneratedDepartment = (departments[depIndex]);

            //System.out.println(GeneratedDepartment);
            //return GeneratedDepartment;

        if (GeneratedDepartment == "Development"){
            String alphaNum = ProjectWithInput.upperAlphabet + ProjectWithInput.numbers;
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            int lenght = 9;
            for (int i = 0; i < lenght; i++) {
                int index = random.nextInt(alphaNum.length());
                char randomChar = alphaNum.charAt(index);
                sb.append(randomChar);
            }

            String randomString = sb.toString();
            System.out.println("Employee's S/N is: " + randomString);
        }
        if (GeneratedDepartment == "Sales" || GeneratedDepartment == "Accounting" ){
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            int lenght = 10;
            for (int i = 0; i < lenght; i++) {
                int index = random.nextInt(ProjectWithInput.numbers.length());
                char randomChar = ProjectWithInput.numbers.charAt(index);
                sb.append(randomChar);
            }

            String phoneNumber = sb.toString();
            System.out.println("Employee's phone number is: " + phoneNumber);

        }
        return GeneratedDepartment;


}
}


class emailGeneratorClass{

    static String email;


    static String emailGen(){
        if (departmentGeneratorClass.GeneratedDepartment == "Sales"){
            email = "@sales.company.com";
            //System.out.println(email);
            //return email;
        }
        if (departmentGeneratorClass.GeneratedDepartment == "Development"){
            email = "@dev.company.com";
            //System.out.println(email);
            //return email;
        }
        if (departmentGeneratorClass.GeneratedDepartment == "Accounting"){
            email = "@accounting.company.com";
            //System.out.println(email);
            //return email;
        }
        if(departmentGeneratorClass.GeneratedDepartment == "None") {
            email = "@company.com";
        }

        return email;
    }

    static String personalEmail(){
        return email = "@gmail.com";
    }

    static void mailCapChange(){
        ProjectWithInput.mailCap = ProjectWithInput.mailCap + 100;
        System.out.println("eMail storage upgrade requested. New capacity: " + ProjectWithInput.mailCap + " GB");
        //return mailCap;
    }


}




    class passwordGen{

    static String Password;
        public static String password() {



            String alphaNum = ProjectWithInput.upperAlphabet + ProjectWithInput.upperAlphabet.toLowerCase();


            char[] chars = {};
            List<Character> list = new ArrayList<>();

            Random random = new Random();

            int lettLenght = 6;
            int numLenght = 4;

            for (int i = 0; i < lettLenght; i++) {
                int index = random.nextInt(alphaNum.length());
                char randomChar = alphaNum.charAt(index);
                list.add(randomChar);
            }
            for (int i = 0; i < numLenght; i++) {
                int index = random.nextInt(ProjectWithInput.numbers.length());
                char randomChar = ProjectWithInput.numbers.charAt(index);
                list.add(randomChar);
            }

            for (char aChar : chars) {
                list.add(aChar);
            }
            Collections.shuffle(list);
            Password = list.toString().replaceAll("[\\[\\],]", "").replaceAll("\\s+","");
            //System.out.println(result);
            return Password;
        }

        public static String changedPass(){
            passwordGen.password();
            System.out.println("Password change requested. New password: " + Password);
            return Password;
        }


    }



