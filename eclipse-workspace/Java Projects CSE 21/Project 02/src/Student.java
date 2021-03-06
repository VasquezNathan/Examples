
public class Student {
	private String name;
	private char gender;
	private Date birthday;
	private boolean matched = false;
	private int compatabilityScore;
	private Preference pref;
	
	Student(String theName, char theGender, Date theBDay, Preference thePref){
		name = theName;
		gender = theGender;
		birthday = theBDay;
		pref = thePref;
		matched = false;
	}
	Student(){
		
	}
	public void setMatched() {
		matched = true;
	}
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public boolean getMatched() {
		return matched;
	}
	
	public Date getBDay() {
		return birthday;
	}
	
	public Preference getPref() {
		return pref;
	}
	
	public int compare(Student st){
		if(gender != st.gender){
		return 0; //Different genders make score 0 (only matching same gender students as roommates)
		}
		
		compatabilityScore = (40 - pref.compare(st.pref)) + (60-birthday.compare(st.birthday)); //Formula : (40 Ð Preferences) + (60 Ð AgeDifference)
		
		if (compatabilityScore < 0){
			return 0; //Highest score is 100 and lowest is 0
			}
			else if (compatabilityScore > 100){
			return 100; //Highest score is 100 and lowest is 0
			}
		
		return compatabilityScore; //Compatibility Score Calculation (returned by compare)
	}
	
}

