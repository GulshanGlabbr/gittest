package demoproject.sachin.task1;

/**
 * Created by HACKER on 2/26/2017.
 */

public class ChatList {
    private  int image;
    private  String email;
    private  String ststus;
    private  int logo;
    ChatList()
    {

    }
    public ChatList(int image,String email,String status,int logo)
    {
        this.image=image;
        this.email=email;
        this.ststus=status;
        this.logo=logo;
    }
    void setimages(int img)
    {
        this.image=img;
    }
    int getimages()
    {
        return  image;
    }
    void setEmail(String id)
    {
        this.email=id;
    }
    String getemail()
    {
        return  email;
    }
    void setStstus(String sts)
    {
        this.ststus=sts;
    }
    String getStstus()
    {
        return ststus ;
    }
    void setLogo(int lg)
    {
        this.logo=lg;
    }
    int getLogo()
    {
        return  logo;
    }
}
