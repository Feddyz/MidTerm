
import members.Member;
import members.SeniorMember;
import members.StandardMember;

import java.util.*;

public class Society {



    private String name = "";

    public ArrayList<Member> StandardList=new ArrayList<Member>(0); // 初始化
    public ArrayList<SeniorMember> SeniorList=new ArrayList<SeniorMember>(0); // 初始化\
    public ArrayList<SeniorMember> CtteeList = new ArrayList<SeniorMember>(0);





    public void addMember(String name,String address){
        StandardMember newMember = new StandardMember();
        newMember.setAddress(address);
        newMember.setName(name);
        StandardList.add(newMember);
    }
    public void addSeniorMember(String name ,String address, int fee){
        SeniorMember newMember = new SeniorMember();
        newMember.setAddress(address);
        newMember.setName(name);
        newMember.setFee(fee);
        SeniorList.add(newMember);
    }
    public void addCttMember(SeniorMember member){
        CtteeList.add(member);
    }





}