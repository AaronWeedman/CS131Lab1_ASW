
public class BasketballTeam extends SportsTeam {
  private int fieldGoals;
  private int fieldGoalsAttempted;
  private int freeThrows;
  private int freeThrowsAttempted;

  public BasketballTeam() {
    super();
    fieldGoals = 0;
    fieldGoalsAttempted = 0;
    freeThrows = 0;
    freeThrowsAttempted = 0;
  }

  public BasketballTeam(String teamName, String teamMascot, String headCoach) {
    super(teamName, teamMascot, headCoach);
    fieldGoals = 0;
    fieldGoalsAttempted = 0;
    freeThrows = 0;
    freeThrowsAttempted = 0;
  }

  public double fieldGoalPercentage() {
    return fieldGoals / fieldGoalsAttempted;
  }

  public double freeThrowPercentage() {
    return freeThrows / freeThrowsAttempted;
  }

  public void setStats(int awins, int alosses, int afieldGoals, int afieldGoalsAttempted, int afreeThrows, int afreeThrowsAttempted) {
    super.wins = wins;
    super.losses = losses;
    afieldGoals = fieldGoals;
    afieldGoalsAttempted = fieldGoalsAttempted;
    afreeThrows = freeThrows;
    afreeThrowsAttempted = freeThrowsAttempted;
  }

  @Override
  public double[] getStats() {
    double winPercentage = getWinPercentage();
    double fieldGoalPercentage = fieldGoalPercentage();
    double freeThrowPercentage = freeThrowPercentage();
    return new double[] {winPercentage, fieldGoalPercentage, freeThrowPercentage};
  }

  // Getters and setters
}
