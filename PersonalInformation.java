
//PersonalInformation.java

//This program displays personal information for a declared individual

public class PersonalInformation
{
  public static void main(String[] args)
  {
      //Variables to hold the personal information
      String name = "So and SO";
      String address = "1780 E University Ave";
      String city = "Las Cruces";
      String state = "New Mexico";
      String zip = "88003";
      String telephone = "575-646-0111";
      String major = "Information Communication Technology";

      //Display the declared information
      System.out.println(name + "\n" + address + ", " + city + ", "
                         + state + ", " + zip + "\n" + telephone
                         + "\n" + major);
  }
}
