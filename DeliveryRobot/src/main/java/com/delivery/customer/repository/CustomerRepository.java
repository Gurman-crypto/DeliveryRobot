package com.delivery.customer.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.delivery.customer.model.Customer;

/*
 * Central repository marker interface. Captures the domain type to manage as well as the domain type's id type. 
Domain repositories extending this interface can selectively expose CRUD methods by simply declaring methods of the same signature 
as those declared in CrudRepository
NoRepositoryBean:
Annotation to exclude repository interfaces from being picked up and thus in consequence getting an instance being created.
This will typically be used when providing an extended base interface for all repositories in combination with a custom repository base class
 to implement methods declared in that intermediate interface. In this case you typically derive your concrete repository interfaces from
  the intermediate one but don't want to create a Spring bean for the intermediate interface.


 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>  {
	
	
	/*
	public List<Alarm> findByEventAttached(String eventUuid);

	public boolean existsByEventAttached(String eventUuid);
	
	@Query("{'id' : ?0 }")
	public Tenant findTenantsByID(String id);
	
	@Query("{'product' : ?0 ,'resource' : ?1 ,'customer' : {$all: ?2}}")
	public Set<EventRule> findEventNatureByResource(String product, String resource, String[] customer);

	@Query("{'product' : ?0 ,'customer' : {$all: ?1}}")
	public List<EventRule> findbyProductAndCustomer(String product, List<String> customer);

	public List<EventRule> findByProduct(String product);

	@Query("{'product' : ?0 ,'resource' : ?1 }")
	public Set<EventRule> findEventNatureByResourceAndProduct(String product, String resource);

	public List<EventRule> findByProductAndResourceAndItemAndTrigger(String product,
			String resource, ItemResponse item, Trigger trigger);
	
	@Query("{'$or':[ {'customer':?0}, {'service':?1}, {'resource':?2} ]}")
	public List<Status> fetchStatusByFilter(String customer, String product, String resource);
	
	@Query("{'instanceUuid':?0}")
	public Status fetchStatusByInstanceUuid(String instanceUuid);
	
	public Status findStatusByProductAndResource(String product, String resource);
*/
}
