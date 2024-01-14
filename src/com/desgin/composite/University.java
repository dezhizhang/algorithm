package src.com.desgin.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{

  List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

  public University(String name, String desc) {
    super(name, desc);
  }

  @Override
  protected void add(OrganizationComponent org) {
    organizationComponents.add(org);
  }

  @Override
  protected void remove(OrganizationComponent org) {
    organizationComponents.remove(org);
  }

  @Override
  protected void print() {
    System.out.println("---" + getName() + "---");
    for(OrganizationComponent org:organizationComponents) {
      org.print();
    }
  }
}
