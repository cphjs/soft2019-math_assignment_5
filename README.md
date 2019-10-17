
# Assignment 5

- [Material](https://datsoftlyngby.github.io/soft2019fall/DM/week-39/info.html)

### Note

I did not manage to fully implement the API. First of all, I had to restrict the type of the elements `T` to be comparable, to determine whether something is a member of a `RangeSet`. Secondly, I did not find a way to compare the sets: the referred to class exercise involved iterating over the sets. In this case that is not possible, since they can contain any sort of element(for example a `BigDecimal`) and be pretty much infinite.