
	public abstract class SportsTeam {
		
		  protected String teamName;
		  protected String teamMascot;
		  protected String headCoach;
		  protected int wins;
		  protected int losses;

		  public SportsTeam() {
		    teamName = "";
		    teamMascot = "";
		    headCoach = "";
		    wins = 0;
		    losses = 0;
		  }//end SportsTeam

		  public SportsTeam(String ateamName, String ateamMascot, String aheadCoach) {
		    ateamName = teamName;
		    ateamMascot = teamMascot;
		    aheadCoach = headCoach;
		    wins = 0;
		    losses = 0;
		  }//end SportsTeam

		  public double getWinPercentage() {
		    return wins / (wins + losses);
		  }

		  public abstract double[] getStats();

}//end class
