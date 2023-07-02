DwarfMoon	"Bors III/Lercurnis B VII B-III"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.00011
	Radius          326.11
	InertiaMoment   0.39812
	Oblateness     (0.220, 0.330, 0.000)
	OblatenessInfo  0.28123
	RotationPeriod  6.4671
	Obliquity       6
	EqAscendNode    -2.7481
    Age             0.006

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_bors_iii.cfg"
		SurfStyle       0.34912
		Randomize      (0.892, -0.021, -0.256)
		colorDistMagn   0.048941
		colorDistFreq   37.401
		detailScale     128
		drivenDarkening 0
		seaLevel        0.16794
		snowLevel       2
		tropicLatitude  0.00017453
		icecapLatitude  2
		icecapHeight    0.65879
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27703
		heightTempGrad  0.625
		beachWidth      0.00039
		tropicWidth     0.07
		mainFreq        1.0687
		venusFreq       1.1389
		venusMagn       0.91603
		mareFreq        1
		mareDensity     0.1145
		terraceProb     0.27844
		erosion         0
		montesMagn      0.07415
		montesFreq      15.768
		montesSpiky     0.99893
		montesFraction  0.10969
		dunesMagn       0.029593
		dunesFreq       3.6981
		dunesFraction   0.061562
		hillsMagn       0.10913
		hillsFreq       35.765
		hillsFraction   0.44742
		hills2Fraction  0
		riversMagn      60.47
		riversFreq      3.2236
		riversSin       6.99
		riftsMagn       54.757
		riftsFreq       2.8135
		riftsSin        6.4187
		eqridgeMagn     0.32824
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  3.3588
		canyonsMagn     0.55253
		canyonsFreq     0.10145
		canyonsFraction 0.74036
		cracksMagn      0.038535
		cracksFreq      0.15384
		cracksOctaves   0
		craterMagn      0.2
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.9771
		volcanoMagn     0
		volcanoFreq     2
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.045802
		volcanoTemp     3000
		lavaCoverTidal  1
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.305
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.32061
		RoughnessIce    0.26718
		SpecularScale   0.56489
		RoughnessBias   0.61069
		RoughnessScale  1.2672
		Hapke           0.38168
		SpotBright      4.1221
		SpotWidth       0.010728
		SpotBrightCB    8.7023
		DayAmbient      0.07
		TempMapMaxTemp  1e+05
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.673651454
		SemiMajorAxisKm 237438.412
		Eccentricity    0.335877863
		Inclination     6
		AscendingNode   -2.7480916
		ArgOfPericenter -52.2137405
		MeanAnomaly     124.607633
	}
}

