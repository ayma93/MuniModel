public class TransferStop extends Stop
{
   int BusStop, LRVStop
   
   TransferStop (int BStop, int LStop, String location)
   {
      BusStop=BStop;
      LRVStop=LStop;
      super.Location = location;
   }
}