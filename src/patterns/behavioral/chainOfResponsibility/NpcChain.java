package patterns.behavioral.chainOfResponsibility;

public interface NpcChain {

     NpcChain setNpc(NpcChain npcChain);
     void checkNpcRequest(Work work, AllEnum allEnum, PlayerC playerC);
}
