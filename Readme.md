# Study JAM 2016

Central repository for all final project built at the end of Study JAM held in New Delhi (2016).

## Contribute

### Short Version
1. Fork this repository
2. Clone the newly forked repository
3. Create a new branch in the forked repo, use naming convention 
> `<nameofperson>_<nameofproject>_<studyjamname>`

4. Now add your project and make commits to the new branch you created in the last step.
5. When done, send a pull request to this repository.
6. Once your pull request is verified and project is running without issues , we merge your project.
7. If you reached till this step , then sit back and have a cookies for you did good work!  :D


### Long version Cheatsheet to create a pull request ( for those hwo are new this :P )
1. Open [github](https://github.com)
2. Signup/Login as a user
3. Goto the [Study JAM Repository](https://github.com/GDGND/study-jam-2016)
4. Fork the repository
5. Now copy the clone url of this newly created repository , provided on github
	![clone url][cloneurl.jpeg]
6. Open up terminal and clone the repository using the copied url
	```bash
	git clone https://github.com/<username>/study-jam-2016
	```
	
7. Move into the created respository on your system
	```bash
	cd study-jam-2016 
	```

8. Create a new branch, using the naming convention  `nameofperson_nameofproject_studyjamname`
	```bash
	git checkout -b [nameofperson_nameofproject_studyjamname]
	```
	> P.S : update the branch name with your values and dont include `[]` when using the git command

9. Create/copy your android project into this directory
10. Add all the files to git
	```bash
	git add .
	```

11. Commit your changes
	```bash
	git commit -m "your commit message"
	```

12. Push your code and branch
	```bash
	git push origin [name_of_your_branch]
	```

13. Open [github](https://github.com) and navigate to your profile page and open the forked `study-jam-2016` repo.

14. Github would already be showing you an update regarding creating a `pull request`
15. Click on `create pull request` and follow the steps, add comments/subject and then create a pull request.

16. Boom ! You are done.

---

>Repeat steps 10 and 11 as you make more changes and commit more on your branch. Your commits on the branch you created are all available to us since the time you created a pull request.