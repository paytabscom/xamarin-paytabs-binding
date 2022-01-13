using System;
using System.Collections.Generic;
using Android.Runtime;
using Java.Interop;

namespace Com.Payment.Paymentsdk.Helper.Utilities {

	// Metadata.xml XPath class reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ActivityUtils']"
	[global::Android.Runtime.Register ("com/payment/paymentsdk/helper/utilities/ActivityUtils", DoNotGenerateAcw=true)]
	public partial class ActivityUtils : global::Java.Lang.Object {
		static readonly JniPeerMembers _members = new XAPeerMembers ("com/payment/paymentsdk/helper/utilities/ActivityUtils", typeof (ActivityUtils));

		internal static IntPtr class_ref {
			get { return _members.JniPeerType.PeerReference.Handle; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		public override global::Java.Interop.JniPeerMembers JniPeerMembers {
			get { return _members; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		protected override IntPtr ThresholdClass {
			get { return _members.JniPeerType.PeerReference.Handle; }
		}

		[global::System.Diagnostics.DebuggerBrowsable (global::System.Diagnostics.DebuggerBrowsableState.Never)]
		[global::System.ComponentModel.EditorBrowsable (global::System.ComponentModel.EditorBrowsableState.Never)]
		protected override global::System.Type ThresholdType {
			get { return _members.ManagedPeerType; }
		}

		protected ActivityUtils (IntPtr javaReference, JniHandleOwnership transfer) : base (javaReference, transfer)
		{
		}

		// Metadata.xml XPath constructor reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ActivityUtils']/constructor[@name='ActivityUtils' and count(parameter)=0]"
		[Register (".ctor", "()V", "")]
		public unsafe ActivityUtils () : base (IntPtr.Zero, JniHandleOwnership.DoNotTransfer)
		{
			const string __id = "()V";

			if (((global::Java.Lang.Object) this).Handle != IntPtr.Zero)
				return;

			try {
				var __r = _members.InstanceMethods.StartCreateInstance (__id, ((object) this).GetType (), null);
				SetHandle (__r.Handle, JniHandleOwnership.TransferLocalRef);
				_members.InstanceMethods.FinishCreateInstance (__id, this, null);
			} finally {
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ActivityUtils']/method[@name='addFragmentToActivity' and count(parameter)=3 and parameter[1][@type='androidx.fragment.app.FragmentManager'] and parameter[2][@type='androidx.fragment.app.Fragment'] and parameter[3][@type='int']]"
		[Register ("addFragmentToActivity", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;I)V", "")]
		public static unsafe void AddFragmentToActivity (global::AndroidX.Fragment.App.FragmentManager fragmentManager, global::AndroidX.Fragment.App.Fragment fragment, int frameId)
		{
			const string __id = "addFragmentToActivity.(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((fragmentManager == null) ? IntPtr.Zero : ((global::Java.Lang.Object) fragmentManager).Handle);
				__args [1] = new JniArgumentValue ((fragment == null) ? IntPtr.Zero : ((global::Java.Lang.Object) fragment).Handle);
				__args [2] = new JniArgumentValue (frameId);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (fragmentManager);
				global::System.GC.KeepAlive (fragment);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ActivityUtils']/method[@name='goToActivity' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='android.content.Intent'] and parameter[3][@type='boolean']]"
		[Register ("goToActivity", "(Landroid/app/Activity;Landroid/content/Intent;Z)V", "")]
		public static unsafe void GoToActivity (global::Android.App.Activity activity, global::Android.Content.Intent myIntent, bool clearBackStack)
		{
			const string __id = "goToActivity.(Landroid/app/Activity;Landroid/content/Intent;Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				__args [1] = new JniArgumentValue ((myIntent == null) ? IntPtr.Zero : ((global::Java.Lang.Object) myIntent).Handle);
				__args [2] = new JniArgumentValue (clearBackStack);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (activity);
				global::System.GC.KeepAlive (myIntent);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ActivityUtils']/method[@name='goToActivity' and count(parameter)=3 and parameter[1][@type='android.app.Activity'] and parameter[2][@type='java.lang.Class'] and parameter[3][@type='boolean']]"
		[Register ("goToActivity", "(Landroid/app/Activity;Ljava/lang/Class;Z)V", "")]
		public static unsafe void GoToActivity (global::Android.App.Activity activity, global::Java.Lang.Class mClassDestination, bool clearBackStack)
		{
			const string __id = "goToActivity.(Landroid/app/Activity;Ljava/lang/Class;Z)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				__args [1] = new JniArgumentValue ((mClassDestination == null) ? IntPtr.Zero : ((global::Java.Lang.Object) mClassDestination).Handle);
				__args [2] = new JniArgumentValue (clearBackStack);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (activity);
				global::System.GC.KeepAlive (mClassDestination);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ActivityUtils']/method[@name='hideKeyboard' and count(parameter)=1 and parameter[1][@type='android.app.Activity']]"
		[Register ("hideKeyboard", "(Landroid/app/Activity;)V", "")]
		public static unsafe void HideKeyboard (global::Android.App.Activity activity)
		{
			const string __id = "hideKeyboard.(Landroid/app/Activity;)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [1];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (activity);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ActivityUtils']/method[@name='isLastFragmentInStack' and count(parameter)=2 and parameter[1][@type='androidx.appcompat.app.AppCompatActivity'] and parameter[2][@type='androidx.fragment.app.Fragment']]"
		[Register ("isLastFragmentInStack", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/fragment/app/Fragment;)Z", "")]
		public static unsafe bool IsLastFragmentInStack (global::AndroidX.AppCompat.App.AppCompatActivity activity, global::AndroidX.Fragment.App.Fragment fragment)
		{
			const string __id = "isLastFragmentInStack.(Landroidx/appcompat/app/AppCompatActivity;Landroidx/fragment/app/Fragment;)Z";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [2];
				__args [0] = new JniArgumentValue ((activity == null) ? IntPtr.Zero : ((global::Java.Lang.Object) activity).Handle);
				__args [1] = new JniArgumentValue ((fragment == null) ? IntPtr.Zero : ((global::Java.Lang.Object) fragment).Handle);
				var __rm = _members.StaticMethods.InvokeBooleanMethod (__id, __args);
				return __rm;
			} finally {
				global::System.GC.KeepAlive (activity);
				global::System.GC.KeepAlive (fragment);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ActivityUtils']/method[@name='replaceFragmentInActivity' and count(parameter)=4 and parameter[1][@type='androidx.fragment.app.FragmentManager'] and parameter[2][@type='androidx.fragment.app.Fragment'] and parameter[3][@type='int'] and parameter[4][@type='boolean']]"
		[Register ("replaceFragmentInActivity", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZ)V", "")]
		public static unsafe void ReplaceFragmentInActivity (global::AndroidX.Fragment.App.FragmentManager fragmentManager, global::AndroidX.Fragment.App.Fragment fragment, int frameId, bool addToBackStack)
		{
			const string __id = "replaceFragmentInActivity.(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZ)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [4];
				__args [0] = new JniArgumentValue ((fragmentManager == null) ? IntPtr.Zero : ((global::Java.Lang.Object) fragmentManager).Handle);
				__args [1] = new JniArgumentValue ((fragment == null) ? IntPtr.Zero : ((global::Java.Lang.Object) fragment).Handle);
				__args [2] = new JniArgumentValue (frameId);
				__args [3] = new JniArgumentValue (addToBackStack);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (fragmentManager);
				global::System.GC.KeepAlive (fragment);
			}
		}

		// Metadata.xml XPath method reference: path="/api/package[@name='com.payment.paymentsdk.helper.utilities']/class[@name='ActivityUtils']/method[@name='replaceFragmentInFragment' and count(parameter)=3 and parameter[1][@type='androidx.fragment.app.FragmentManager'] and parameter[2][@type='androidx.fragment.app.Fragment'] and parameter[3][@type='int']]"
		[Register ("replaceFragmentInFragment", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;I)V", "")]
		public static unsafe void ReplaceFragmentInFragment (global::AndroidX.Fragment.App.FragmentManager fragmentManager, global::AndroidX.Fragment.App.Fragment fragment, int frameId)
		{
			const string __id = "replaceFragmentInFragment.(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;I)V";
			try {
				JniArgumentValue* __args = stackalloc JniArgumentValue [3];
				__args [0] = new JniArgumentValue ((fragmentManager == null) ? IntPtr.Zero : ((global::Java.Lang.Object) fragmentManager).Handle);
				__args [1] = new JniArgumentValue ((fragment == null) ? IntPtr.Zero : ((global::Java.Lang.Object) fragment).Handle);
				__args [2] = new JniArgumentValue (frameId);
				_members.StaticMethods.InvokeVoidMethod (__id, __args);
			} finally {
				global::System.GC.KeepAlive (fragmentManager);
				global::System.GC.KeepAlive (fragment);
			}
		}

	}
}
