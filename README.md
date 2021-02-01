# Hospitals/Residents Problem

The Hospitals/Residents Problem (HR)
An instance of HR involves a set of residents and a set f hospitals, each resident seeking a post at one hospital, and each hospital having a number of available posts (its capacity). Each resident ranks some (acceptable) hospitals in strict order, and each hospital ranks its applicants in strict order. A matching is a set of pairs (resident, hospital) such that each resident is assigned to at most one hospital and the capacities of the hospitals are not exceeded. A matching is stable if there is no pair (r, h) such that r is assigned to h' but r prefers h better than h' and h prefers r better than some of its assigned residents. We consider the problem of creating a stable matching between residents and hospitals.

The task : 

Create an object-oriented model of the problem. You should have at least the following classes: Resident, Hospital, Main.

Create all the objects in the example (one by one or using streams).

Create a list of residents, using an ArrayList implementation. Sort the residents, using a comparator.

Create a set of hospitals, using a TreeSet implementation. Make sure that Hospital objects are comparable.

Create two maps (having different implementations) describing the residents and the hospital preferences and print them on the screen.

Using Java Stream API, write queries that display the residents who find acceptable H0 and H2, and the hospitals that have R0 as their top preference.
