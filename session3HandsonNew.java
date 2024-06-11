public class session3HandsonNew {
        public static void main(String[] args) {
            String information=String.format("name : %s  age : %d" , "Soheila ," , 40);
            System.out.println(information);
            String information1=information.toUpperCase();
            System.out.println("toUpperCase : " +information1);
            String information2=information1.replace("SOHEILA","Fanap");
            System.out.println("Information2 : " + information2);
            int index=information2.indexOf("p");
            String information3=information2.replace(information2.substring(index+1,information2.length()-1)," ");
            System.out.println(information3);
            String information4=information3.replace("0"," ");
            System.out.println(information4);
            System.out.println("toLowerCase : " +information4.toLowerCase());


        }

}
