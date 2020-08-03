
package model;

public class Skill
{
	private  Long skilld;
	private String skillName;
	private int skillcount;
	public Long getSkilld() {
		return skilld;
	}
	public void setSkilld(Long skilld) {
		this.skilld = skilld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getSkillcount() {
		return skillcount;
	}
	public void setSkillcount(int skillcount) {
		this.skillcount = skillcount;
	}
	public Skill(Long skilld, String skillName, int skillcount) {
		super();
		this.skilld = skilld;
		this.skillName = skillName;
		this.skillcount = skillcount;
	}
}
