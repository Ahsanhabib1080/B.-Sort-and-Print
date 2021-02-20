courses = []

# To print Messages
def printmsg():
    print("\n")
    print("Press 1 to add courses")
    print("Press 2 to view courses")
    print("Press 3 to delete specific courses")
    print("Press 4 to remove all the courses")

# To add semesters.
# exeption handling for better input management.
def addsemester():
    try:
        printmsg()
        ikey = int(input(">"))
        if ikey == 1:
            while True:
                temp = input("Enter the Courses (Type EXIT to return to main menu):").upper()
                if temp == "EXIT":
                    mainfunction()
                else:
                    courses.append(temp)

        elif ikey == 2:
            viewCourse()
            mainfunction()

        elif ikey == 3:
            # For Better Exception Handling or input handling.
            try:
                tempKey = int(input("Enter the Index number You want to delete."))
                courses.pop(tempKey)
                print("Deleted")
                viewCourse()
                mainfunction()
            except IndexError:
                print("IndexError!\nPlease Recheck Your Values.\n")
                addsemester()

        elif ikey == 4:
            courses.clear()
            print("Course List Nullified")
            viewCourse()
            mainfunction()

        else:
            print("You've Entered Wrong keyword\nPlease Try again")
            addsemester()

    except ValueError:
        print("Please Recheck Your Input.\nRedirecting to Main Menu.\n\n")
        mainfunction()


def viewCourse():
    count = len(courses)
    if count == 0:
        print("You have no courses")
    for i in range(count):
        print(f"{i}. {courses[i]}")


def mainfunction():
    addsemester()


mainfunction()
