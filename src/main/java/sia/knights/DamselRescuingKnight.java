package sia.knights;

/**
 * @author chen
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    /**
     * 紧密耦合
     */
    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }

}
