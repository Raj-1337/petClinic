package works.wckd.petClinic.services;

import works.wckd.petClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lname);

}
