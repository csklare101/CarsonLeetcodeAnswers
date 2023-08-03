Select P.firstName, P.lastName, A.city, A.state
From Person P left outer join Address A
on P.personId = A.personId;
