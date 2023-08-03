select email
from Person
group by email
Having count(email) > 1;
