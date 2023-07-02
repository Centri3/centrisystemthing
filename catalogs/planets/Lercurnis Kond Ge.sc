Planet	"Ge/Lercurnis B IV"
{
	ParentBody     "Kond"
	Class          "Terra"
	Mass            0.00037909
	Radius          470
	InertiaMoment   0.3985
	Obliquity       -8
	EqAscendNode    -79.695
	TidalLocked     true

	AbsMagn         1.8534
	SlopeParam      6.3229
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_ge.cfg"
		SurfStyle       0.98015
		Randomize      (0.118, 0.335, -0.269)
		colorDistMagn   0.051984
		colorDistFreq   45.076
		detailScale     128
		drivenDarkening 0
		seaLevel        0.21374
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1.5
		icecapHeight    0
		climatePole     1
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30619
		heightTempGrad  0.375
		beachWidth      0.000843
		tropicWidth     0.5
		mainFreq        0.9542
		venusFreq       0.64122
		venusMagn       0.15267
		mareFreq        0
		mareDensity     0.20326
		terraceProb     0
		erosion         0
		montesMagn      0.02
		montesFreq      25
		montesSpiky     0.25191
		montesFraction  1
		dunesMagn       0.03692
		dunesFreq       4.0529
		dunesFraction   0.4343
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      7
		riversFreq      6.7939
		riversSin       7.0501
		riftsMagn       1
		riftsFreq       7.4809
		riftsSin        8.8151
		canyonsMagn     0.1
		canyonsFreq     10
		canyonsFraction 0.92366
		cracksMagn      0
		cracksFreq      1
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0
		volcanoFreq     0.58015
		volcanoDensity  0.12977
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     1305.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.7653
		stripeTwist     0.39039
		cycloneMagn     0.69488
		cycloneFreq     0.52812
		cycloneDensity  0.34447
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.1946
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  90000
	}

	NoOcean         true

	Clouds
	{
		Height          25
		Velocity        176.78
		BumpHeight      0.50384
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.9565
		ModulateColor  (0.832 0.783 0.764)
		ModulateBright  1
		Opacity         0.03
		mainFreq        0.32061
		mainOctaves     10
		Coverage        0
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Ge"
		Height          100
		Density         0.032157
		Pressure        0.0436
		Greenhouse      10
		Bright          1
		Opacity         0.7
		SkyLight        2.8234
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	50
			SO2       	50
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.057
		SemiMajorAxis   0.0638184318
		Eccentricity    0.35
		Inclination     -8
		AscendingNode   -79.6946565
		ArgOfPericenter 35.7251908
		MeanAnomaly     -222.59542
	}
}

