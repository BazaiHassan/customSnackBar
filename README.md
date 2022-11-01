# Usage:

Step 1: Add below classes to your project:
      
      - CustomSnackBar
      - CustomSnackBarView
      - Extension.kt

Step 2: Add below layouts to your layout directory:

       - custom_snackbar_view.xml
       - custom_snack_bar.xml
       
Step 3: Add below drawable file to your drawble directory:

        - bg_custom_snack_bar.xml
        
        
Now it's time to use the custom snack bar:
for that act like below:
- in the MainActivity or any other classes just call the CustomSnackBar and then you will access to its methods.
see the example:

          CustomSnackBar.success(it,"Success Message","This is message body",R.mipmap.ic_launcher).show()


