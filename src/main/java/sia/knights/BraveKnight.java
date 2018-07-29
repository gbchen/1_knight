package sia.knights;

/**
 * BraveKnight:勇敢的骑士
 * @author chen
 */
public class BraveKnight implements Knight {

    /**
     * Quest:探险任务
     */
    private Quest quest;

    /**
     * BraveKnight没有自行创建探险任务，而是在构造的时候把探险任务作为构造 器参数传入。
     * 这是依赖注入的方式之一，即构造器注入(constructor injection)
     */
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }

}
