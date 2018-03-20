package sia.knights;

public class DamselRescuingKnight implements Knight {

  private RescueDamselQuest quest;

  /**
   * 紧密耦合
   */
  public DamselRescuingKnight() {
    this.quest = new RescueDamselQuest();
  }

  @Override
  public void embarkOnQuest() {
    quest.embark();
  }

}
