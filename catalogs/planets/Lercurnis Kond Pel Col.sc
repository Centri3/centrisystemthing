Moon	"Col/Lercurnis B VII II"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.02
	Radius          1840.8
	InertiaMoment   0.35973
	Oblateness      0.0024513
	Obliquity       0.1
	EqAscendNode    33
	TidalLocked     true

	AlbedoBond      0.8
	AlbedoGeom      0.86
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_col.cfg"
		SurfStyle       0.40175
		Randomize      (-0.626, -0.107, -0.443)
		colorDistMagn   0.053897
		colorDistFreq   208.97
		detailScale     128
		drivenDarkening 0.16031
		seaLevel        0.53435
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.54502
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3909
		heightTempGrad  0.625
		beachWidth      0.0011692
		tropicWidth     0.07
		mainFreq        1.8844
		venusFreq       1.6641
		venusMagn       1.4122
		mareFreq        0.3
		mareDensity     1
		terraceProb     0.15881
		erosion         0
		montesMagn      0.01
		montesFreq      25
		montesSpiky     0.99237
		montesFraction  1
		dunesMagn       0.036406
		dunesFreq       11.924
		dunesFraction   0.64041
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      0
		riversSin       0
		riftsMagn       54.389
		riftsFreq       2.8599
		riftsSin        5.5892
		eqridgeMagn     0.49618
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  4.0458
		canyonsMagn     0.56804
		canyonsFreq     0.65521
		canyonsFraction 0.89288
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.54198
		volcanoMagn     0.26718
		volcanoFreq     0.85496
		volcanoDensity  0.32061
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.37405
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.0471
		stripeTwist     0.079111
		cycloneMagn     2.8236
		cycloneFreq     0.57969
		cycloneDensity  0.3923
		cycloneOctaves  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           0.99975
		SpotBright      2.4999
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          25
		Velocity        134.78
		BumpHeight      2.8267
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.59542
		mainFreq        3
		mainOctaves     0
		Coverage        0.17557
		stripeZones     1.0471
		stripeTwist     0.079111
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Pel Col"
		Height          100
		Density         -1e+38
		Pressure        0.001
		Greenhouse      0.045175
		Bright          1.5
		Opacity         1
		SkyLight        0.45802
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	98
			N2        	1
			SO2       	1
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.38957644
		SemiMajorAxisKm 552266.59
		Eccentricity    0.001
		Inclination     0.1
		AscendingNode   33
		ArgOfPericenter -33
		MeanAnomaly     0
	}
}

