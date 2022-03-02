package Exercise5

def days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

println days
println days.size()
//days.pop()
// Remove last day
days.removeLast()
println days
days << "Saturday"
println days
println days[3]
