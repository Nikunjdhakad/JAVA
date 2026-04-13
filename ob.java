class hostle
{
    int roomno;
    String type;
    int bad;
}


public class ob {
    public static void main(String a[])
    {
        hostle host =new hostle();

        host.roomno =25055;
        host.type = "'boys'";
        host.bad = 883;


        hostle host1 = new hostle();
        host1.roomno = 26;
        host1.type = "girls";
        host1.bad =355;


        
        hostle host2 = new hostle();
        host2.roomno = 273;
        host2.type = " senior girls";
        host2.bad =5;

        
        hostle host3 = new hostle();
        host3.roomno = 420;
        host3.type = "senior boys";
        host3.bad =6;

        hostle hostles[]= new hostle[4];

        hostles[0]= host;
        hostles[1]= host1;
        hostles[2]= host2;
        hostles[3]= host3;

        for(hostle H : hostles)
        {
            System.out.println(H.roomno +" : " + H.type + " : " + H.bad);
        }


    }
}
