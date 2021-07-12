// WARNING
//
// This file has been generated automatically by Visual Studio to store outlets and
// actions made in the UI designer. If it is removed, they will be lost.
// Manual changes to this file may not be handled correctly.
//
using Foundation;
using System.CodeDom.Compiler;

namespace PayTabsSample
{
	[Register ("ViewController")]
	partial class ViewController
	{
		[Outlet]
		UIKit.UIButton btnPaywithAPMs { get; set; }

		[Outlet]
		UIKit.UIButton btnPaywithApplePay { get; set; }

		[Outlet]
		UIKit.UIButton btnPaywithCard { get; set; }
		
		void ReleaseDesignerOutlets ()
		{
			if (btnPaywithAPMs != null) {
				btnPaywithAPMs.Dispose ();
				btnPaywithAPMs = null;
			}

			if (btnPaywithApplePay != null) {
				btnPaywithApplePay.Dispose ();
				btnPaywithApplePay = null;
			}

			if (btnPaywithCard != null) {
				btnPaywithCard.Dispose ();
				btnPaywithCard = null;
			}
		}
	}
}
