select pe.firstName, pe.lastName, ad.city, ad.state from Person pe
left outer join Address ad on pe.personId = ad.personId
