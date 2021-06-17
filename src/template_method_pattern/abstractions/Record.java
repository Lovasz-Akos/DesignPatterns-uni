package template_method_pattern.abstractions;

public abstract class Record {
	 public void Save() {
		this.BeforeSave();
		//save code here
		System.out.println("xd");
		this.AfterSave();
	}
	
	public void BeforeSave() {};
	public void AfterSave() {};
	public void FailedSave() {};
	

}
