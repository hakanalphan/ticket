import './RegisterForm.css'

  import { Formik, Form, Field } from 'formik';
  import React from 'react';
  import * as Yup from 'yup';
import Navbar from '../layouts/navbar';
  
  function LoginForm() {
    const initialValues = { emailorphoneNumber: '', parola: '' };
  
    const Scheme = Yup.object().shape({
      emailorphoneNumber: Yup.string().required('Email or phone required'),
      parola: Yup.string().min(6, 'Password must be at least 6 characters').required('Required'),
    });
  
    return (
      <div>


<Navbar/>
        <Formik initialValues={initialValues} validationSchema={Scheme} onSubmit={(values) => console.log(values)}>
          <Form>
            <div>
              <Field
                name="emailorphoneNumber"
                type="text"
                placeholder="emailorphoneNumber"
              />
            </div>
            <div>
              <Field
                name="parola"
                type="password"
                placeholder="parola"
              />
            </div>
            <div>
              <label>
                <Field type="checkbox" name="agreement" />
                I agree to the Terms and Conditions
              </label>
            </div>
            <div>
              <button type="submit">Login</button>
            </div>
          </Form>
        </Formik>
      </div>
    );
  }
  
  export default LoginForm;