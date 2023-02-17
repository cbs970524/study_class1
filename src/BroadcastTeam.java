import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BroadcastTeam {
    List<String> member = new ArrayList<String>();
    List<String> camera = new ArrayList<String>();
    List<String> speaker = new ArrayList<String>();
    List<String> mic = new ArrayList<String>();
    List<String> computer = new ArrayList<String>();

    BroadcastTeam(){
        camera.add("sony");
        speaker.add("jbl");
        mic.add("sure");
    }
    BroadcastTeam(String camera,String speaker, String mic){
        this.camera.add(camera);
        this.speaker.add(speaker);
        this.mic.add(mic);
    }

    void broadcasting(String type) {
        System.out.println(type + "방송을 시작합니다");
    }
    void addNewMember(String member){
        this.member.add(member);
    }
    void deleteMember(String member){
        this.member.remove(member);
    }
    void  buyComputer(String computer){
        this.computer.add(computer);
    }
    void throwComputer(String computer){
        this.computer.remove(computer);
    }
    void fixComputer(String computer){
        System.out.println(computer+"를 수리하였습니다");
    }
    void buy(String tool, String modelName){

    }
    void showMember(){

    }
}