Select id, movie, description, rating
From Cinema
Where mod(id,2) != 0 AND description != "boring"
Order by rating desc;
