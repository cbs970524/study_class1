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
    void buyCamera(String camera){
        this.camera.add(camera);
    }
    void throwCamera(String camera){
        this.camera.remove(camera);
    }
    void fixCamera(String camera){
        System.out.println(camera+"를 수리하였습니다.");
    }
    void buySpeaker(String speaker){
        this.speaker.add(speaker);
    }
    void throwSpeaker(String spaker){
        this.speaker.remove(spaker);
    }
    void fixSpeaker(String speaker){
        System.out.println(speaker + "를 수리했습니다.");
    }
    void buyMic(String mic){
        this.mic.add(mic);
    }
    void throwMic(String mic){
        this.mic.remove(mic);
    }
    void fixMic(String mic){
        System.out.println(mic + "를 수리했습니다.");
    }
    void showInfo(){
        System.out.println("방송부의 인원은 "+member+"가 있으며 장비는 "+camera+speaker+mic+computer + "가 있습니다.");
    }
}