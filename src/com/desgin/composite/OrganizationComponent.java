package src.com.desgin.composite;

public class OrganizationComponent {
  private String name;
  private String desc;

  protected void add(OrganizationComponent org) {
    throw new UnsupportedOperationException();
  }

  protected  void remove(OrganizationComponent org) {
    throw new UnsupportedOperationException();
  }

  public OrganizationComponent(String name,String desc) {
    super();
    this.name = name;
    this.desc = desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getDesc() {
    return desc;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  protected void print() {

  }
}
