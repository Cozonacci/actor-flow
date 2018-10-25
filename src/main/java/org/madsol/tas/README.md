This project aims at defining some basic rules regarding a flow manager test automation solution.

The core purpose is to highlight the context mindset to allow a functional, modular and scalable framework design 
for test automation solutions regardless of the domains or business rules implemented within the system under test. 

Some generic rules guiding the design:
- For any activity based on fragile (e.g. persistent) state of SUT there is no assurance of idempotence
- Given the fact that SUT state is a function of Time, for any _A(d1) @ ti_ and _A(d1) @ ti+1_ the resulting 
state of the system under test will be different (there should exist at least one instance)
- Due to these (and other) aspects, the TAS should create/be responsible the entire dependency stack of changes for
a given business flow


Entities of the _Flow Model_:
- **Actor**: represents the actor entity (of a TAS) which interacts with the SUT in order to achieve a business outcome
- **Action**: represents the activity entity (of a TAS) that is performed by a given Actor onto the SUT 
- **Task**: represents a set of actions (in a predefined order) to achieve a larger business outcome
- **Flow**: is a group of tasks which performed with solve a business problem (i.e. business capability of the system) 
- **Role**: is a restrictive attribute of SUT access in order to perform a given action
- **Completion Check**: represents a post-condition that verifies a given actions was successfully applied