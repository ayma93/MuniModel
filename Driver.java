public class Driver extends User
{
   int serviceID;

   Driver (int TID, String DriverName, char on, char off)
   {
      serviceID=TID;
      name = DriverName;
   }
}