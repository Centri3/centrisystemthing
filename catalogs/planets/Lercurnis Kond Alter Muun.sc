Planet	"Alter Muun/Lercurnis B XI"
{
	ParentBody     "Kond"
	Class          "Terra"
	Mass            0.045693
	Radius          2366.4
	InertiaMoment   0.34837
	RotationPeriod  119.32
	RotationEpoch   1451545
	Obliquity       201.24
	EqAscendNode    -176.33

	Albedo          0.04
	Brightness      1
	BrightnessReal  1
	Color          (0.788 0.787 0.786)

	Life
	{
		Class   "Organic"
		Type    "Unicellular"
		Biome   "Subglacial"
		Panspermia true
	}

	Surface
	{
		Preset         "lercurnis_kond_alter_muun.cfg"
		SurfStyle       0.15372
		Randomize      (-0.839, 0.033, 0.918)
		colorDistMagn   0.088835
		colorDistFreq   270.37
		detailScale     128
		drivenDarkening 0
		seaLevel        0.0076336
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.8855
		icecapHeight    0
		climatePole     1
		climateTropic   0.6875
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46369
		heightTempGrad  0.625
		beachWidth      0.00049319
		tropicWidth     0.07
		mainFreq        1.8976
		venusFreq       1.2698
		venusMagn       0
		mareFreq        1.2834
		mareDensity     0.17538
		terraceProb     0.50191
		erosion         0
		montesMagn      0.06
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.046608
		dunesFreq       18.617
		dunesFraction   0.94045
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      5
		riversFreq      5
		riversSin       6.0995
		riftsMagn       100
		riftsFreq       7.1756
		riftsSin        5.7626
		canyonsMagn     0.50816
		canyonsFreq     0.89669
		canyonsFraction 0.51545
		cracksMagn      0
		cracksFreq      0.1
		cracksOctaves   15
		craterMagn      2
		craterFreq      5
		craterDensity   1
		craterOctaves   15
		craterRayedFactor 0
		volcanoMagn     0
		volcanoFreq     0.70229
		volcanoDensity  0.34351
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.26718
		volcanoTemp     1740.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     2.4035
		cycloneFreq     1.1511
		cycloneDensity  0.51149
		cycloneOctaves  2
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.39877
		RoughnessIce    0.23371
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		SpotBrightCB    2.5
		SpotWidthCB     0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          29.736
		Velocity        70.702
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		ModulateColor  (0.000 0.000 0.000)
		ModulateBright  1
		Opacity         0.18321
		mainFreq        1.0763
		mainOctaves     0
		Coverage        0.62595
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          29.736
		Velocity        72.52
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		ModulateColor  (0.000 0.000 0.000)
		ModulateBright  1
		Opacity         0.16794
		mainFreq        1.0763
		mainOctaves     0
		Coverage        0.62595
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          29.736
		Velocity        40.32
		BumpHeight      3.7082
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		ModulateColor  (0.000 0.000 0.000)
		ModulateBright  1
		Opacity         0.29008
		mainFreq        1.0763
		mainOctaves     0
		Coverage        0.62595
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Alter Muun"
		Height          100
		Density         4.2253e-08
		Pressure        0.1
		Greenhouse      34.351
		Bright          1.5
		Opacity         1
		SkyLight        0.16667
		Hue             0
		Saturation      0.81217

		Composition
		{
			CO2       	50
			SO2       	50
			O2        	5.8573e-05
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          2.58824025
		SemiMajorAxis   0.812268338
		Eccentricity    0.167938931
		Inclination     2.86854307
		AscendingNode   42.2325496
		ArgOfPericenter -2.7480916
		MeanAnomaly     50
	}
}

